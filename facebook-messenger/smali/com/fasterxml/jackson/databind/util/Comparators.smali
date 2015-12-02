.class public Lcom/fasterxml/jackson/databind/util/Comparators;
.super Ljava/lang/Object;
.source "Comparators.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getArrayComparator(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 20
    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v0

    .line 21
    new-instance v1, Lcom/fasterxml/jackson/databind/util/Comparators$1;

    invoke-direct {v1, p0, v0}, Lcom/fasterxml/jackson/databind/util/Comparators$1;-><init>(Ljava/lang/Object;I)V

    return-object v1
.end method
