.class final Lcom/cleanmaster/sdk/cmloginsdkjar/internal/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:[Ljava/io/File;

.field final synthetic b:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;


# direct methods
.method constructor <init>(Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;[Ljava/io/File;)V
    .locals 0

    .prologue
    .line 211
    iput-object p1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/b;->b:Lcom/cleanmaster/sdk/cmloginsdkjar/internal/FileLruCache;

    iput-object p2, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/b;->a:[Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 214
    iget-object v1, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/internal/b;->a:[Ljava/io/File;

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 215
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 214
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 217
    :cond_0
    return-void
.end method
