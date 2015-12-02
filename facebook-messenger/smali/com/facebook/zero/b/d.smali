.class public Lcom/facebook/zero/b/d;
.super Lcom/facebook/d/c/a;
.source "ZeroDbUtil.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/d/c/a",
        "<",
        "Lcom/facebook/zero/b/b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/facebook/zero/b/a;)V
    .locals 1

    .prologue
    .line 13
    const-string v0, "zero_rating_db_key_value_properties_table"

    invoke-direct {p0, p1, v0}, Lcom/facebook/d/c/a;-><init>(Lcom/google/common/base/Supplier;Ljava/lang/String;)V

    .line 14
    return-void
.end method
