.class final Lcom/google/android/gms/internal/fl;
.super Landroid/graphics/drawable/Drawable;


# static fields
.field private static final a:Lcom/google/android/gms/internal/fl;

.field private static final b:Lcom/google/android/gms/internal/fm;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/fl;

    invoke-direct {v0}, Lcom/google/android/gms/internal/fl;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/fl;->a:Lcom/google/android/gms/internal/fl;

    new-instance v0, Lcom/google/android/gms/internal/fm;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/fm;-><init>(B)V

    sput-object v0, Lcom/google/android/gms/internal/fl;->b:Lcom/google/android/gms/internal/fm;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    return-void
.end method

.method static synthetic a()Lcom/google/android/gms/internal/fl;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/fl;->a:Lcom/google/android/gms/internal/fl;

    return-object v0
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 0

    return-void
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/fl;->b:Lcom/google/android/gms/internal/fm;

    return-object v0
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x2

    return v0
.end method

.method public final setAlpha(I)V
    .locals 0

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    return-void
.end method
