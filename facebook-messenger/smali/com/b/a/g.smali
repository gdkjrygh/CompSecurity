.class public Lcom/b/a/g;
.super Lcom/b/a/b;
.source "ViolationInfoProxyR09.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/b/a/b",
        "<",
        "Landroid/os/StrictMode$ViolationInfo;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/b/a/c;)V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0, p1}, Lcom/b/a/b;-><init>(Lcom/b/a/c;)V

    .line 9
    return-void
.end method


# virtual methods
.method public handle(Landroid/os/StrictMode$ViolationInfo;)Landroid/os/StrictMode$ViolationInfo;
    .locals 2

    .prologue
    .line 13
    iget-object v0, p0, Lcom/b/a/g;->job:Lcom/b/a/c;

    iget-object v1, p1, Landroid/os/StrictMode$ViolationInfo;->crashInfo:Landroid/app/ApplicationErrorReport$CrashInfo;

    iget-object v1, v1, Landroid/app/ApplicationErrorReport$CrashInfo;->stackTrace:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/b/a/c;->report(Ljava/lang/String;)V

    .line 15
    return-object p1
.end method

.method public bridge synthetic handle(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 5
    check-cast p1, Landroid/os/StrictMode$ViolationInfo;

    invoke-virtual {p0, p1}, Lcom/b/a/g;->handle(Landroid/os/StrictMode$ViolationInfo;)Landroid/os/StrictMode$ViolationInfo;

    move-result-object v0

    return-object v0
.end method
