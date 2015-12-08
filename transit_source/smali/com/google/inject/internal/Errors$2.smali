.class final Lcom/google/inject/internal/Errors$2;
.super Lcom/google/inject/internal/Errors$Converter;
.source "Errors.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/Errors;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/inject/internal/Errors$Converter",
        "<",
        "Ljava/lang/Class;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    .prologue
    .line 643
    .local p1, "x0":Ljava/lang/Class;, "Ljava/lang/Class<Ljava/lang/Class;>;"
    invoke-direct {p0, p1}, Lcom/google/inject/internal/Errors$Converter;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public toString(Ljava/lang/Class;)Ljava/lang/String;
    .locals 1
    .param p1, "c"    # Ljava/lang/Class;

    .prologue
    .line 645
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toString(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .param p1, "x0"    # Ljava/lang/Object;

    .prologue
    .line 643
    check-cast p1, Ljava/lang/Class;

    .end local p1    # "x0":Ljava/lang/Object;
    invoke-virtual {p0, p1}, Lcom/google/inject/internal/Errors$2;->toString(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
