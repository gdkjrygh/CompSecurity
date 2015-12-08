.class Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;
.super Ljava/lang/Object;
.source "Gradient.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/maps/android/heatmaps/Gradient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ColorInterval"
.end annotation


# instance fields
.field private final color1:I

.field private final color2:I

.field private final duration:F

.field final synthetic this$0:Lcom/google/maps/android/heatmaps/Gradient;


# direct methods
.method private constructor <init>(Lcom/google/maps/android/heatmaps/Gradient;IIF)V
    .locals 0
    .param p2, "color1"    # I
    .param p3, "color2"    # I
    .param p4, "duration"    # F

    .prologue
    .line 40
    iput-object p1, p0, Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;->this$0:Lcom/google/maps/android/heatmaps/Gradient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput p2, p0, Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;->color1:I

    .line 42
    iput p3, p0, Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;->color2:I

    .line 43
    iput p4, p0, Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;->duration:F

    .line 44
    return-void
.end method

.method synthetic constructor <init>(Lcom/google/maps/android/heatmaps/Gradient;IIFLcom/google/maps/android/heatmaps/Gradient$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/maps/android/heatmaps/Gradient;
    .param p2, "x1"    # I
    .param p3, "x2"    # I
    .param p4, "x3"    # F
    .param p5, "x4"    # Lcom/google/maps/android/heatmaps/Gradient$1;

    .prologue
    .line 30
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;-><init>(Lcom/google/maps/android/heatmaps/Gradient;IIF)V

    return-void
.end method

.method static synthetic access$100(Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;)F
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;

    .prologue
    .line 30
    iget v0, p0, Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;->duration:F

    return v0
.end method

.method static synthetic access$200(Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;)I
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;

    .prologue
    .line 30
    iget v0, p0, Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;->color1:I

    return v0
.end method

.method static synthetic access$300(Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;)I
    .locals 1
    .param p0, "x0"    # Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;

    .prologue
    .line 30
    iget v0, p0, Lcom/google/maps/android/heatmaps/Gradient$ColorInterval;->color2:I

    return v0
.end method
