.class final Lkik/android/chat/activity/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/activity/q;


# direct methods
.method constructor <init>(Lkik/android/chat/activity/q;)V
    .locals 0

    .prologue
    .line 317
    iput-object p1, p0, Lkik/android/chat/activity/s;->a:Lkik/android/chat/activity/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    .line 322
    iget-object v0, p0, Lkik/android/chat/activity/s;->a:Lkik/android/chat/activity/q;

    iget-object v0, v0, Lkik/android/chat/activity/q;->b:Lkik/android/chat/activity/KikApiLandingActivity;

    invoke-virtual {v0}, Lkik/android/chat/activity/KikApiLandingActivity;->a()V

    .line 323
    iget-object v0, p0, Lkik/android/chat/activity/s;->a:Lkik/android/chat/activity/q;

    iget-object v0, v0, Lkik/android/chat/activity/q;->b:Lkik/android/chat/activity/KikApiLandingActivity;

    invoke-virtual {v0}, Lkik/android/chat/activity/KikApiLandingActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0900a2

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lkik/android/chat/activity/s;->a:Lkik/android/chat/activity/q;

    iget-object v4, v4, Lkik/android/chat/activity/q;->a:Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 324
    iget-object v1, p0, Lkik/android/chat/activity/s;->a:Lkik/android/chat/activity/q;

    iget-object v1, v1, Lkik/android/chat/activity/q;->b:Lkik/android/chat/activity/KikApiLandingActivity;

    invoke-static {v1}, Lkik/android/chat/activity/KikApiLandingActivity;->c(Lkik/android/chat/activity/KikApiLandingActivity;)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 325
    iget-object v0, p0, Lkik/android/chat/activity/s;->a:Lkik/android/chat/activity/q;

    iget-object v0, v0, Lkik/android/chat/activity/q;->b:Lkik/android/chat/activity/KikApiLandingActivity;

    invoke-static {v0}, Lkik/android/chat/activity/KikApiLandingActivity;->c(Lkik/android/chat/activity/KikApiLandingActivity;)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 327
    return-void
.end method
