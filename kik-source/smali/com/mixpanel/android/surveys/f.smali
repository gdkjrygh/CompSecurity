.class final Lcom/mixpanel/android/surveys/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field final synthetic a:Lcom/mixpanel/android/surveys/SurveyActivity;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/surveys/SurveyActivity;)V
    .locals 0

    .prologue
    .line 174
    iput-object p1, p0, Lcom/mixpanel/android/surveys/f;->a:Lcom/mixpanel/android/surveys/SurveyActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 176
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 177
    sget v0, Lcom/mixpanel/android/a$b;->b:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    .line 181
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 179
    :cond_0
    sget v0, Lcom/mixpanel/android/a$b;->a:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_0
.end method
