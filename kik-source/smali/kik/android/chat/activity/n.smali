.class final Lkik/android/chat/activity/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/activity/m;


# direct methods
.method constructor <init>(Lkik/android/chat/activity/m;)V
    .locals 0

    .prologue
    .line 193
    iput-object p1, p0, Lkik/android/chat/activity/n;->a:Lkik/android/chat/activity/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 197
    iget-object v0, p0, Lkik/android/chat/activity/n;->a:Lkik/android/chat/activity/m;

    iget-object v0, v0, Lkik/android/chat/activity/m;->a:Lkik/android/chat/activity/KikActivityBase$a;

    invoke-static {v0}, Lkik/android/chat/activity/KikActivityBase$a;->a(Lkik/android/chat/activity/KikActivityBase$a;)Lcom/kik/g/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    .line 198
    iget-object v0, p0, Lkik/android/chat/activity/n;->a:Lkik/android/chat/activity/m;

    iget-object v0, v0, Lkik/android/chat/activity/m;->a:Lkik/android/chat/activity/KikActivityBase$a;

    iget-object v0, v0, Lkik/android/chat/activity/KikActivityBase$a;->a:Lkik/android/chat/activity/KikActivityBase;

    invoke-virtual {v0}, Lkik/android/chat/activity/KikActivityBase;->finish()V

    .line 199
    iget-object v0, p0, Lkik/android/chat/activity/n;->a:Lkik/android/chat/activity/m;

    iget-object v0, v0, Lkik/android/chat/activity/m;->a:Lkik/android/chat/activity/KikActivityBase$a;

    iget-object v0, v0, Lkik/android/chat/activity/KikActivityBase$a;->a:Lkik/android/chat/activity/KikActivityBase;

    invoke-static {v0}, Lkik/android/chat/activity/KikActivityBase;->a(Lkik/android/chat/activity/KikActivityBase;)Lkik/android/chat/activity/KikActivityBase$a;

    .line 200
    return-void
.end method
