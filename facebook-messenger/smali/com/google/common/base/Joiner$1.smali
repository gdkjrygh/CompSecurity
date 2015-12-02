.class Lcom/google/common/base/Joiner$1;
.super Lcom/google/common/base/Joiner;
.source "Joiner.java"


# instance fields
.field final synthetic this$0:Lcom/google/common/base/Joiner;

.field final synthetic val$nullText:Ljava/lang/String;


# virtual methods
.method toString(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 188
    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/google/common/base/Joiner$1;->val$nullText:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/common/base/Joiner$1;->this$0:Lcom/google/common/base/Joiner;

    invoke-virtual {v0, p1}, Lcom/google/common/base/Joiner;->toString(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_0
.end method
