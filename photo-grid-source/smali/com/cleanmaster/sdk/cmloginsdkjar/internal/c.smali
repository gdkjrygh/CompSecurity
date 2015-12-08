.class final Lcom/cleanmaster/sdk/cmloginsdkjar/internal/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;


# direct methods
.method constructor <init>(Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;)V
    .locals 0

    .prologue
    .line 253
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/c;->a:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 256
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/c;->a:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;

    # invokes: Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->trim()V
    invoke-static {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;->access$200(Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;)V

    .line 257
    return-void
.end method
