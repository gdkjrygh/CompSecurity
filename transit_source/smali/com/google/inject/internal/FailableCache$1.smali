.class Lcom/google/inject/internal/FailableCache$1;
.super Ljava/lang/Object;
.source "FailableCache.java"

# interfaces
.implements Lcom/google/inject/internal/util/$Function;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/FailableCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/inject/internal/util/$Function",
        "<TK;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/google/inject/internal/FailableCache;


# direct methods
.method constructor <init>(Lcom/google/inject/internal/FailableCache;)V
    .locals 0

    .prologue
    .line 34
    .local p0, "this":Lcom/google/inject/internal/FailableCache$1;, "Lcom/google/inject/internal/FailableCache.1;"
    iput-object p1, p0, Lcom/google/inject/internal/FailableCache$1;->this$0:Lcom/google/inject/internal/FailableCache;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lcom/google/inject/internal/util/$Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .prologue
    .line 36
    .local p0, "this":Lcom/google/inject/internal/FailableCache$1;, "Lcom/google/inject/internal/FailableCache.1;"
    .local p1, "key":Ljava/lang/Object;, "TK;"
    new-instance v1, Lcom/google/inject/internal/Errors;

    invoke-direct {v1}, Lcom/google/inject/internal/Errors;-><init>()V

    .line 37
    .local v1, "errors":Lcom/google/inject/internal/Errors;
    const/4 v2, 0x0

    .line 39
    .local v2, "result":Ljava/lang/Object;, "TV;"
    :try_start_0
    iget-object v3, p0, Lcom/google/inject/internal/FailableCache$1;->this$0:Lcom/google/inject/internal/FailableCache;

    invoke-virtual {v3, p1, v1}, Lcom/google/inject/internal/FailableCache;->create(Ljava/lang/Object;Lcom/google/inject/internal/Errors;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/inject/internal/ErrorsException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 43
    .end local v2    # "result":Ljava/lang/Object;, "TV;"
    :goto_0
    invoke-virtual {v1}, Lcom/google/inject/internal/Errors;->hasErrors()Z

    move-result v3

    if-eqz v3, :cond_0

    .end local v1    # "errors":Lcom/google/inject/internal/Errors;
    :goto_1
    return-object v1

    .line 40
    .restart local v1    # "errors":Lcom/google/inject/internal/Errors;
    .restart local v2    # "result":Ljava/lang/Object;, "TV;"
    :catch_0
    move-exception v0

    .line 41
    .local v0, "e":Lcom/google/inject/internal/ErrorsException;
    invoke-virtual {v0}, Lcom/google/inject/internal/ErrorsException;->getErrors()Lcom/google/inject/internal/Errors;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/google/inject/internal/Errors;->merge(Lcom/google/inject/internal/Errors;)Lcom/google/inject/internal/Errors;

    goto :goto_0

    .end local v0    # "e":Lcom/google/inject/internal/ErrorsException;
    .end local v2    # "result":Ljava/lang/Object;, "TV;"
    :cond_0
    move-object v1, v2

    .line 43
    goto :goto_1
.end method
