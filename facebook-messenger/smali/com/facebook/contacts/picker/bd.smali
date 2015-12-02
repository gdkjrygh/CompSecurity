.class public Lcom/facebook/contacts/picker/bd;
.super Ljava/lang/Object;
.source "UserComparatorByName.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/facebook/user/User;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/text/Collator;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/contacts/picker/bd;->a:Ljava/text/Collator;

    .line 20
    iget-object v0, p0, Lcom/facebook/contacts/picker/bd;->a:Ljava/text/Collator;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/text/Collator;->setStrength(I)V

    .line 21
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/user/User;Lcom/facebook/user/User;)I
    .locals 3

    .prologue
    .line 25
    invoke-virtual {p1}, Lcom/facebook/user/User;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 26
    invoke-virtual {p2}, Lcom/facebook/user/User;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 27
    iget-object v2, p0, Lcom/facebook/contacts/picker/bd;->a:Ljava/text/Collator;

    invoke-virtual {v2, v0, v1}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 14
    check-cast p1, Lcom/facebook/user/User;

    check-cast p2, Lcom/facebook/user/User;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/contacts/picker/bd;->a(Lcom/facebook/user/User;Lcom/facebook/user/User;)I

    move-result v0

    return v0
.end method
