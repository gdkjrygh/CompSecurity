.class public Lyong/powerfull/equalizer/EquzeHelper;
.super Ljava/lang/Object;
.source "EquzeHelper.java"


# static fields
.field static e0:I

.field static e1:I

.field static e2:I

.field static e3:I

.field static e4:I

.field static ee:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 4
    sput v2, Lyong/powerfull/equalizer/EquzeHelper;->e0:I

    .line 5
    sput v2, Lyong/powerfull/equalizer/EquzeHelper;->e1:I

    .line 6
    sput v2, Lyong/powerfull/equalizer/EquzeHelper;->e2:I

    .line 7
    sput v2, Lyong/powerfull/equalizer/EquzeHelper;->e3:I

    .line 8
    sput v2, Lyong/powerfull/equalizer/EquzeHelper;->e4:I

    .line 9
    const/4 v0, 0x5

    new-array v0, v0, [I

    sget v1, Lyong/powerfull/equalizer/EquzeHelper;->e0:I

    aput v1, v0, v2

    const/4 v1, 0x1

    sget v2, Lyong/powerfull/equalizer/EquzeHelper;->e1:I

    aput v2, v0, v1

    const/4 v1, 0x2

    sget v2, Lyong/powerfull/equalizer/EquzeHelper;->e2:I

    aput v2, v0, v1

    const/4 v1, 0x3

    sget v2, Lyong/powerfull/equalizer/EquzeHelper;->e3:I

    aput v2, v0, v1

    const/4 v1, 0x4

    sget v2, Lyong/powerfull/equalizer/EquzeHelper;->e4:I

    aput v2, v0, v1

    sput-object v0, Lyong/powerfull/equalizer/EquzeHelper;->ee:[I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getEe(I)I
    .locals 1
    .param p0, "e"    # I

    .prologue
    .line 11
    sget-object v0, Lyong/powerfull/equalizer/EquzeHelper;->ee:[I

    aget v0, v0, p0

    return v0
.end method

.method public static setEe(II)V
    .locals 1
    .param p0, "e"    # I
    .param p1, "value"    # I

    .prologue
    .line 14
    sget-object v0, Lyong/powerfull/equalizer/EquzeHelper;->ee:[I

    aput p1, v0, p0

    .line 15
    return-void
.end method
