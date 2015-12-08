.class final Lkik/android/chat/activity/m;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/activity/KikActivityBase$a;


# direct methods
.method constructor <init>(Lkik/android/chat/activity/KikActivityBase$a;)V
    .locals 0

    .prologue
    .line 189
    iput-object p1, p0, Lkik/android/chat/activity/m;->a:Lkik/android/chat/activity/KikActivityBase$a;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 189
    iget-object v0, p0, Lkik/android/chat/activity/m;->a:Lkik/android/chat/activity/KikActivityBase$a;

    iget-object v0, v0, Lkik/android/chat/activity/KikActivityBase$a;->a:Lkik/android/chat/activity/KikActivityBase;

    new-instance v1, Lkik/android/chat/activity/n;

    invoke-direct {v1, p0}, Lkik/android/chat/activity/n;-><init>(Lkik/android/chat/activity/m;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/activity/KikActivityBase;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
