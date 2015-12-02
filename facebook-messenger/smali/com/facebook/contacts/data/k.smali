.class public Lcom/facebook/contacts/data/k;
.super Lcom/facebook/d/c/a;
.source "DbContactsPropertyUtil.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/d/c/a",
        "<",
        "Lcom/facebook/contacts/data/j;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/facebook/contacts/data/b;)V
    .locals 1

    .prologue
    .line 13
    const-string v0, "contacts_db_properties"

    invoke-direct {p0, p1, v0}, Lcom/facebook/d/c/a;-><init>(Lcom/google/common/base/Supplier;Ljava/lang/String;)V

    .line 14
    return-void
.end method
