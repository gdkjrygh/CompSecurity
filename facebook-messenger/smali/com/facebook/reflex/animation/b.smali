.class public final enum Lcom/facebook/reflex/animation/b;
.super Ljava/lang/Enum;
.source "Field.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/reflex/animation/b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/reflex/animation/b;

.field public static final enum AnchorX:Lcom/facebook/reflex/animation/b;

.field public static final enum AnchorY:Lcom/facebook/reflex/animation/b;

.field public static final enum Opacity:Lcom/facebook/reflex/animation/b;

.field public static final enum Perspective:Lcom/facebook/reflex/animation/b;

.field public static final enum RotationX:Lcom/facebook/reflex/animation/b;

.field public static final enum RotationY:Lcom/facebook/reflex/animation/b;

.field public static final enum RotationZ:Lcom/facebook/reflex/animation/b;

.field public static final enum Scale:Lcom/facebook/reflex/animation/b;

.field public static final enum TranslateX:Lcom/facebook/reflex/animation/b;

.field public static final enum TranslateY:Lcom/facebook/reflex/animation/b;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 7
    new-instance v0, Lcom/facebook/reflex/animation/b;

    const-string v1, "TranslateX"

    invoke-direct {v0, v1, v3}, Lcom/facebook/reflex/animation/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/animation/b;->TranslateX:Lcom/facebook/reflex/animation/b;

    .line 8
    new-instance v0, Lcom/facebook/reflex/animation/b;

    const-string v1, "TranslateY"

    invoke-direct {v0, v1, v4}, Lcom/facebook/reflex/animation/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/animation/b;->TranslateY:Lcom/facebook/reflex/animation/b;

    .line 9
    new-instance v0, Lcom/facebook/reflex/animation/b;

    const-string v1, "Scale"

    invoke-direct {v0, v1, v5}, Lcom/facebook/reflex/animation/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/animation/b;->Scale:Lcom/facebook/reflex/animation/b;

    .line 10
    new-instance v0, Lcom/facebook/reflex/animation/b;

    const-string v1, "Opacity"

    invoke-direct {v0, v1, v6}, Lcom/facebook/reflex/animation/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/animation/b;->Opacity:Lcom/facebook/reflex/animation/b;

    .line 11
    new-instance v0, Lcom/facebook/reflex/animation/b;

    const-string v1, "RotationX"

    invoke-direct {v0, v1, v7}, Lcom/facebook/reflex/animation/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/animation/b;->RotationX:Lcom/facebook/reflex/animation/b;

    .line 12
    new-instance v0, Lcom/facebook/reflex/animation/b;

    const-string v1, "RotationY"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/reflex/animation/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/animation/b;->RotationY:Lcom/facebook/reflex/animation/b;

    .line 13
    new-instance v0, Lcom/facebook/reflex/animation/b;

    const-string v1, "RotationZ"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/facebook/reflex/animation/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/animation/b;->RotationZ:Lcom/facebook/reflex/animation/b;

    .line 14
    new-instance v0, Lcom/facebook/reflex/animation/b;

    const-string v1, "AnchorX"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/facebook/reflex/animation/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/animation/b;->AnchorX:Lcom/facebook/reflex/animation/b;

    .line 15
    new-instance v0, Lcom/facebook/reflex/animation/b;

    const-string v1, "AnchorY"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/facebook/reflex/animation/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/animation/b;->AnchorY:Lcom/facebook/reflex/animation/b;

    .line 16
    new-instance v0, Lcom/facebook/reflex/animation/b;

    const-string v1, "Perspective"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/facebook/reflex/animation/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/animation/b;->Perspective:Lcom/facebook/reflex/animation/b;

    .line 5
    const/16 v0, 0xa

    new-array v0, v0, [Lcom/facebook/reflex/animation/b;

    sget-object v1, Lcom/facebook/reflex/animation/b;->TranslateX:Lcom/facebook/reflex/animation/b;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/reflex/animation/b;->TranslateY:Lcom/facebook/reflex/animation/b;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/reflex/animation/b;->Scale:Lcom/facebook/reflex/animation/b;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/reflex/animation/b;->Opacity:Lcom/facebook/reflex/animation/b;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/reflex/animation/b;->RotationX:Lcom/facebook/reflex/animation/b;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/reflex/animation/b;->RotationY:Lcom/facebook/reflex/animation/b;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/facebook/reflex/animation/b;->RotationZ:Lcom/facebook/reflex/animation/b;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/facebook/reflex/animation/b;->AnchorX:Lcom/facebook/reflex/animation/b;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/facebook/reflex/animation/b;->AnchorY:Lcom/facebook/reflex/animation/b;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/facebook/reflex/animation/b;->Perspective:Lcom/facebook/reflex/animation/b;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/reflex/animation/b;->$VALUES:[Lcom/facebook/reflex/animation/b;

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
    .line 5
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/reflex/animation/b;
    .locals 1

    .prologue
    .line 5
    const-class v0, Lcom/facebook/reflex/animation/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/animation/b;

    return-object v0
.end method

.method public static values()[Lcom/facebook/reflex/animation/b;
    .locals 1

    .prologue
    .line 5
    sget-object v0, Lcom/facebook/reflex/animation/b;->$VALUES:[Lcom/facebook/reflex/animation/b;

    invoke-virtual {v0}, [Lcom/facebook/reflex/animation/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/reflex/animation/b;

    return-object v0
.end method
