.class final Lcom/mixpanel/android/mpmetrics/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mixpanel/android/mpmetrics/c$b;


# instance fields
.field final synthetic a:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;

.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:I

.field final synthetic d:Lcom/mixpanel/android/mpmetrics/v$c;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/mpmetrics/v$c;Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;Landroid/app/Activity;I)V
    .locals 0

    .prologue
    .line 1405
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/z;->d:Lcom/mixpanel/android/mpmetrics/v$c;

    iput-object p2, p0, Lcom/mixpanel/android/mpmetrics/z;->a:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;

    iput-object p3, p0, Lcom/mixpanel/android/mpmetrics/z;->b:Landroid/app/Activity;

    iput p4, p0, Lcom/mixpanel/android/mpmetrics/z;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;I)V
    .locals 3

    .prologue
    .line 1408
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/z;->a:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;

    invoke-virtual {v0, p1}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->a(Landroid/graphics/Bitmap;)V

    .line 1409
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/z;->a:Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;

    invoke-virtual {v0, p2}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$SurveyState;->a(I)V

    .line 1411
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/z;->b:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/mixpanel/android/surveys/SurveyActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1412
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1413
    const/high16 v1, 0x20000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1414
    const-string v1, "com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY"

    iget v2, p0, Lcom/mixpanel/android/mpmetrics/z;->c:I

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1415
    iget-object v1, p0, Lcom/mixpanel/android/mpmetrics/z;->b:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 1416
    return-void
.end method
