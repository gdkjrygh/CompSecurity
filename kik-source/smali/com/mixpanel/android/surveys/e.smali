.class final Lcom/mixpanel/android/surveys/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/mixpanel/android/mpmetrics/InAppNotification;

.field final synthetic b:Lcom/mixpanel/android/surveys/SurveyActivity;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/surveys/SurveyActivity;Lcom/mixpanel/android/mpmetrics/InAppNotification;)V
    .locals 0

    .prologue
    .line 150
    iput-object p1, p0, Lcom/mixpanel/android/surveys/e;->b:Lcom/mixpanel/android/surveys/SurveyActivity;

    iput-object p2, p0, Lcom/mixpanel/android/surveys/e;->a:Lcom/mixpanel/android/mpmetrics/InAppNotification;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 153
    iget-object v0, p0, Lcom/mixpanel/android/surveys/e;->a:Lcom/mixpanel/android/mpmetrics/InAppNotification;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->i()Ljava/lang/String;

    move-result-object v0

    .line 154
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 157
    :try_start_0
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 164
    :try_start_1
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 165
    iget-object v0, p0, Lcom/mixpanel/android/surveys/e;->b:Lcom/mixpanel/android/surveys/SurveyActivity;

    invoke-virtual {v0, v1}, Lcom/mixpanel/android/surveys/SurveyActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 167
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/mixpanel/android/surveys/e;->b:Lcom/mixpanel/android/surveys/SurveyActivity;

    invoke-virtual {v0}, Lcom/mixpanel/android/surveys/SurveyActivity;->finish()V

    .line 171
    iget-object v0, p0, Lcom/mixpanel/android/surveys/e;->b:Lcom/mixpanel/android/surveys/SurveyActivity;

    invoke-static {v0}, Lcom/mixpanel/android/surveys/SurveyActivity;->a(Lcom/mixpanel/android/surveys/SurveyActivity;)I

    move-result v0

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->a(I)V

    .line 172
    :goto_1
    return-void

    .line 159
    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0
.end method
