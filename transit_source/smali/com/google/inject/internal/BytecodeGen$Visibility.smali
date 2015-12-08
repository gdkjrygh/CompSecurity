.class public abstract enum Lcom/google/inject/internal/BytecodeGen$Visibility;
.super Ljava/lang/Enum;
.source "BytecodeGen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/BytecodeGen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "Visibility"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/inject/internal/BytecodeGen$Visibility;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/inject/internal/BytecodeGen$Visibility;

.field public static final enum PUBLIC:Lcom/google/inject/internal/BytecodeGen$Visibility;

.field public static final enum SAME_PACKAGE:Lcom/google/inject/internal/BytecodeGen$Visibility;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 236
    new-instance v0, Lcom/google/inject/internal/BytecodeGen$Visibility$1;

    const-string v1, "PUBLIC"

    invoke-direct {v0, v1, v2}, Lcom/google/inject/internal/BytecodeGen$Visibility$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/inject/internal/BytecodeGen$Visibility;->PUBLIC:Lcom/google/inject/internal/BytecodeGen$Visibility;

    .line 249
    new-instance v0, Lcom/google/inject/internal/BytecodeGen$Visibility$2;

    const-string v1, "SAME_PACKAGE"

    invoke-direct {v0, v1, v3}, Lcom/google/inject/internal/BytecodeGen$Visibility$2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/inject/internal/BytecodeGen$Visibility;->SAME_PACKAGE:Lcom/google/inject/internal/BytecodeGen$Visibility;

    .line 230
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/inject/internal/BytecodeGen$Visibility;

    sget-object v1, Lcom/google/inject/internal/BytecodeGen$Visibility;->PUBLIC:Lcom/google/inject/internal/BytecodeGen$Visibility;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/inject/internal/BytecodeGen$Visibility;->SAME_PACKAGE:Lcom/google/inject/internal/BytecodeGen$Visibility;

    aput-object v1, v0, v3

    sput-object v0, Lcom/google/inject/internal/BytecodeGen$Visibility;->$VALUES:[Lcom/google/inject/internal/BytecodeGen$Visibility;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 230
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/google/inject/internal/BytecodeGen$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # I
    .param p3, "x2"    # Lcom/google/inject/internal/BytecodeGen$1;

    .prologue
    .line 230
    invoke-direct {p0, p1, p2}, Lcom/google/inject/internal/BytecodeGen$Visibility;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static forMember(Ljava/lang/reflect/Member;)Lcom/google/inject/internal/BytecodeGen$Visibility;
    .locals 8
    .param p0, "member"    # Ljava/lang/reflect/Member;

    .prologue
    .line 257
    invoke-interface {p0}, Ljava/lang/reflect/Member;->getModifiers()I

    move-result v6

    and-int/lit8 v6, v6, 0x5

    if-nez v6, :cond_0

    .line 258
    sget-object v6, Lcom/google/inject/internal/BytecodeGen$Visibility;->SAME_PACKAGE:Lcom/google/inject/internal/BytecodeGen$Visibility;

    .line 278
    .end local p0    # "member":Ljava/lang/reflect/Member;
    .local v0, "arr$":[Ljava/lang/Class;
    .local v1, "i$":I
    .local v2, "len$":I
    .local v4, "parameterTypes":[Ljava/lang/Class;
    :goto_0
    return-object v6

    .line 262
    .end local v0    # "arr$":[Ljava/lang/Class;
    .end local v1    # "i$":I
    .end local v2    # "len$":I
    .end local v4    # "parameterTypes":[Ljava/lang/Class;
    .restart local p0    # "member":Ljava/lang/reflect/Member;
    :cond_0
    instance-of v6, p0, Ljava/lang/reflect/Constructor;

    if-eqz v6, :cond_1

    .line 263
    check-cast p0, Ljava/lang/reflect/Constructor;

    .end local p0    # "member":Ljava/lang/reflect/Member;
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    .line 272
    .restart local v4    # "parameterTypes":[Ljava/lang/Class;
    :goto_1
    move-object v0, v4

    .restart local v0    # "arr$":[Ljava/lang/Class;
    array-length v2, v0

    .restart local v2    # "len$":I
    const/4 v1, 0x0

    .restart local v1    # "i$":I
    :goto_2
    if-ge v1, v2, :cond_4

    aget-object v5, v0, v1

    .line 273
    .local v5, "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-static {v5}, Lcom/google/inject/internal/BytecodeGen$Visibility;->forType(Ljava/lang/Class;)Lcom/google/inject/internal/BytecodeGen$Visibility;

    move-result-object v6

    sget-object v7, Lcom/google/inject/internal/BytecodeGen$Visibility;->SAME_PACKAGE:Lcom/google/inject/internal/BytecodeGen$Visibility;

    if-ne v6, v7, :cond_3

    .line 274
    sget-object v6, Lcom/google/inject/internal/BytecodeGen$Visibility;->SAME_PACKAGE:Lcom/google/inject/internal/BytecodeGen$Visibility;

    goto :goto_0

    .end local v0    # "arr$":[Ljava/lang/Class;
    .end local v1    # "i$":I
    .end local v2    # "len$":I
    .end local v4    # "parameterTypes":[Ljava/lang/Class;
    .end local v5    # "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .restart local p0    # "member":Ljava/lang/reflect/Member;
    :cond_1
    move-object v3, p0

    .line 265
    check-cast v3, Ljava/lang/reflect/Method;

    .line 266
    .local v3, "method":Ljava/lang/reflect/Method;
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v6

    invoke-static {v6}, Lcom/google/inject/internal/BytecodeGen$Visibility;->forType(Ljava/lang/Class;)Lcom/google/inject/internal/BytecodeGen$Visibility;

    move-result-object v6

    sget-object v7, Lcom/google/inject/internal/BytecodeGen$Visibility;->SAME_PACKAGE:Lcom/google/inject/internal/BytecodeGen$Visibility;

    if-ne v6, v7, :cond_2

    .line 267
    sget-object v6, Lcom/google/inject/internal/BytecodeGen$Visibility;->SAME_PACKAGE:Lcom/google/inject/internal/BytecodeGen$Visibility;

    goto :goto_0

    .line 269
    :cond_2
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    .restart local v4    # "parameterTypes":[Ljava/lang/Class;
    goto :goto_1

    .line 272
    .end local v3    # "method":Ljava/lang/reflect/Method;
    .end local p0    # "member":Ljava/lang/reflect/Member;
    .restart local v0    # "arr$":[Ljava/lang/Class;
    .restart local v1    # "i$":I
    .restart local v2    # "len$":I
    .restart local v5    # "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 278
    .end local v5    # "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    :cond_4
    sget-object v6, Lcom/google/inject/internal/BytecodeGen$Visibility;->PUBLIC:Lcom/google/inject/internal/BytecodeGen$Visibility;

    goto :goto_0
.end method

.method public static forType(Ljava/lang/Class;)Lcom/google/inject/internal/BytecodeGen$Visibility;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)",
            "Lcom/google/inject/internal/BytecodeGen$Visibility;"
        }
    .end annotation

    .prologue
    .line 282
    .local p0, "type":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    and-int/lit8 v0, v0, 0x5

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/inject/internal/BytecodeGen$Visibility;->PUBLIC:Lcom/google/inject/internal/BytecodeGen$Visibility;

    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/google/inject/internal/BytecodeGen$Visibility;->SAME_PACKAGE:Lcom/google/inject/internal/BytecodeGen$Visibility;

    goto :goto_0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/inject/internal/BytecodeGen$Visibility;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 230
    const-class v0, Lcom/google/inject/internal/BytecodeGen$Visibility;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/inject/internal/BytecodeGen$Visibility;

    return-object v0
.end method

.method public static values()[Lcom/google/inject/internal/BytecodeGen$Visibility;
    .locals 1

    .prologue
    .line 230
    sget-object v0, Lcom/google/inject/internal/BytecodeGen$Visibility;->$VALUES:[Lcom/google/inject/internal/BytecodeGen$Visibility;

    invoke-virtual {v0}, [Lcom/google/inject/internal/BytecodeGen$Visibility;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/inject/internal/BytecodeGen$Visibility;

    return-object v0
.end method


# virtual methods
.method public abstract and(Lcom/google/inject/internal/BytecodeGen$Visibility;)Lcom/google/inject/internal/BytecodeGen$Visibility;
.end method
