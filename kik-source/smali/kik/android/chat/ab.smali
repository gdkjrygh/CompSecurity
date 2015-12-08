.class final Lkik/android/chat/ab;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/KikApplication;


# direct methods
.method constructor <init>(Lkik/android/chat/KikApplication;)V
    .locals 0

    .prologue
    .line 311
    iput-object p1, p0, Lkik/android/chat/ab;->a:Lkik/android/chat/KikApplication;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 311
    check-cast p2, Ljava/lang/Integer;

    iget-object v0, p0, Lkik/android/chat/ab;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->d(Lkik/android/chat/KikApplication;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lkik/android/chat/ac;

    invoke-direct {v1, p0, p2}, Lkik/android/chat/ac;-><init>(Lkik/android/chat/ab;Ljava/lang/Integer;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
