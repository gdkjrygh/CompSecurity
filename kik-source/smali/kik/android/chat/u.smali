.class final Lkik/android/chat/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/t;


# direct methods
.method constructor <init>(Lkik/android/chat/t;)V
    .locals 0

    .prologue
    .line 1112
    iput-object p1, p0, Lkik/android/chat/u;->a:Lkik/android/chat/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 1116
    iget-object v0, p0, Lkik/android/chat/u;->a:Lkik/android/chat/t;

    iget-object v0, v0, Lkik/android/chat/t;->b:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/chat/KikApplication;->b(Lkik/android/chat/KikApplication;)Lkik/a/e/r;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lkik/a/e/r;->a(ZZ)V

    .line 1117
    return-void
.end method
