.class Lcom/facebook/orca/emoji/ad;
.super Ljava/lang/Object;
.source "Emojis.java"


# instance fields
.field private final a:I

.field private final b:I


# direct methods
.method private constructor <init>(I)V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput p1, p0, Lcom/facebook/orca/emoji/ad;->a:I

    .line 79
    iput p1, p0, Lcom/facebook/orca/emoji/ad;->b:I

    .line 80
    return-void
.end method

.method private constructor <init>(II)V
    .locals 0

    .prologue
    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput p1, p0, Lcom/facebook/orca/emoji/ad;->a:I

    .line 74
    iput p2, p0, Lcom/facebook/orca/emoji/ad;->b:I

    .line 75
    return-void
.end method

.method synthetic constructor <init>(IILcom/facebook/orca/emoji/ab;)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/emoji/ad;-><init>(II)V

    return-void
.end method

.method synthetic constructor <init>(ILcom/facebook/orca/emoji/ab;)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0, p1}, Lcom/facebook/orca/emoji/ad;-><init>(I)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/emoji/ad;)I
    .locals 1

    .prologue
    .line 68
    iget v0, p0, Lcom/facebook/orca/emoji/ad;->a:I

    return v0
.end method

.method static synthetic b(Lcom/facebook/orca/emoji/ad;)I
    .locals 1

    .prologue
    .line 68
    iget v0, p0, Lcom/facebook/orca/emoji/ad;->b:I

    return v0
.end method
