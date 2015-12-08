.class final Lcom/mixpanel/android/surveys/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/mixpanel/android/surveys/SurveyActivity;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/surveys/SurveyActivity;)V
    .locals 0

    .prologue
    .line 280
    iput-object p1, p0, Lcom/mixpanel/android/surveys/j;->a:Lcom/mixpanel/android/surveys/SurveyActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 283
    iget-object v0, p0, Lcom/mixpanel/android/surveys/j;->a:Lcom/mixpanel/android/surveys/SurveyActivity;

    invoke-virtual {v0}, Lcom/mixpanel/android/surveys/SurveyActivity;->finish()V

    .line 284
    return-void
.end method
