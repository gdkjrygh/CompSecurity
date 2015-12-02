.class public final Lcom/facebook/contacts/data/ab;
.super Ljava/lang/Object;
.source "FbContactsContract.java"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/google/common/a/fi;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/facebook/contacts/data/ad;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic c:Lcom/facebook/contacts/data/x;


# direct methods
.method public constructor <init>(Lcom/facebook/contacts/data/x;Ljava/lang/String;Lcom/google/common/a/fi;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/common/a/fi",
            "<",
            "Lcom/facebook/contacts/data/ad;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 143
    iput-object p1, p0, Lcom/facebook/contacts/data/ab;->c:Lcom/facebook/contacts/data/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 144
    iput-object p2, p0, Lcom/facebook/contacts/data/ab;->a:Ljava/lang/String;

    .line 145
    iput-object p3, p0, Lcom/facebook/contacts/data/ab;->b:Lcom/google/common/a/fi;

    .line 146
    return-void
.end method
