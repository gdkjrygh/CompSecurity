.class final enum Lcom/google/inject/internal/BytecodeGen$Visibility$1;
.super Lcom/google/inject/internal/BytecodeGen$Visibility;
.source "BytecodeGen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/BytecodeGen$Visibility;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4008
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .prologue
    .line 236
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/inject/internal/BytecodeGen$Visibility;-><init>(Ljava/lang/String;ILcom/google/inject/internal/BytecodeGen$1;)V

    return-void
.end method


# virtual methods
.method public and(Lcom/google/inject/internal/BytecodeGen$Visibility;)Lcom/google/inject/internal/BytecodeGen$Visibility;
    .locals 0
    .param p1, "that"    # Lcom/google/inject/internal/BytecodeGen$Visibility;

    .prologue
    .line 239
    return-object p1
.end method
