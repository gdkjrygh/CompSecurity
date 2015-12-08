.class public final Lcom/konylabs/capitalone/R$styleable;
.super Ljava/lang/Object;
.source "R.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/konylabs/capitalone/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "styleable"
.end annotation


# static fields
.field public static final C1Attrs:[I

.field public static final C1Attrs_navButtonColor:I = 0xa

.field public static final C1Attrs_navOption:I = 0x9

.field public static final C1Attrs_src:I = 0x0

.field public static final C1Attrs_subText:I = 0x5

.field public static final C1Attrs_subTextColor:I = 0x8

.field public static final C1Attrs_subTextSize:I = 0x6

.field public static final C1Attrs_subTextStyle:I = 0x7

.field public static final C1Attrs_text:I = 0x4

.field public static final C1Attrs_textColor:I = 0x3

.field public static final C1Attrs_textSize:I = 0x1

.field public static final C1Attrs_textStyle:I = 0x2


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 1287
    const/16 v0, 0xb

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/konylabs/capitalone/R$styleable;->C1Attrs:[I

    return-void

    :array_0
    .array-data 4
        0x7f010000
        0x7f010001
        0x7f010002
        0x7f010003
        0x7f010004
        0x7f010005
        0x7f010006
        0x7f010007
        0x7f010008
        0x7f010009
        0x7f01000a
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 1256
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
