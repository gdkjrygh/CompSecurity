.class Lcom/facebook/user/a/j;
.super Ljava/lang/Object;
.source "NameLookupBuilder.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/user/a/i;


# direct methods
.method constructor <init>(Lcom/facebook/user/a/i;)V
    .locals 0

    .prologue
    .line 114
    iput-object p1, p0, Lcom/facebook/user/a/j;->a:Lcom/facebook/user/a/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 117
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 114
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/user/a/j;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method
