.class final Lkik/android/chat/w;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/KikApplication;


# direct methods
.method constructor <init>(Lkik/android/chat/KikApplication;)V
    .locals 0

    .prologue
    .line 1541
    iput-object p1, p0, Lkik/android/chat/w;->a:Lkik/android/chat/KikApplication;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 1544
    iget-object v0, p0, Lkik/android/chat/w;->a:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->y(Lkik/android/chat/KikApplication;)Lkik/android/util/ce;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/util/ce;->f()V

    .line 1545
    return-void
.end method
