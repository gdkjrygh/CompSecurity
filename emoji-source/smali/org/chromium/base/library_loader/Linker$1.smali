.class final Lorg/chromium/base/library_loader/Linker$1;
.super Ljava/lang/Object;
.source "Linker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/base/library_loader/Linker;->postCallbackOnMainThread(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic val$opaque:J


# direct methods
.method constructor <init>(J)V
    .locals 1

    .prologue
    .line 848
    iput-wide p1, p0, Lorg/chromium/base/library_loader/Linker$1;->val$opaque:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 851
    iget-wide v0, p0, Lorg/chromium/base/library_loader/Linker$1;->val$opaque:J

    # invokes: Lorg/chromium/base/library_loader/Linker;->nativeRunCallbackOnUiThread(J)V
    invoke-static {v0, v1}, Lorg/chromium/base/library_loader/Linker;->access$000(J)V

    .line 852
    return-void
.end method
