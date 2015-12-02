.class public Lcom/facebook/contacts/models/a/c;
.super Ljava/lang/Object;
.source "UserAndUnmatchedContactProfileTypesSetProvider.java"

# interfaces
.implements Lcom/facebook/contacts/models/a/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/fi;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/facebook/contacts/models/a/a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 14
    sget-object v0, Lcom/facebook/contacts/models/a/a;->USER:Lcom/facebook/contacts/models/a/a;

    sget-object v1, Lcom/facebook/contacts/models/a/a;->UNMATCHED:Lcom/facebook/contacts/models/a/a;

    invoke-static {v0, v1}, Lcom/google/common/a/fi;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method
