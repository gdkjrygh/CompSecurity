.class final Lcom/google/android/gms/internal/cz$a;
.super Landroid/graphics/drawable/Drawable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/cz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/cz$a$a;
    }
.end annotation


# static fields
.field private static final ks:Lcom/google/android/gms/internal/cz$a;

.field private static final kt:Lcom/google/android/gms/internal/cz$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/cz$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/cz$a;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/cz$a;->ks:Lcom/google/android/gms/internal/cz$a;

    new-instance v0, Lcom/google/android/gms/internal/cz$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/cz$a$a;-><init>(Lcom/google/android/gms/internal/cz$1;)V

    sput-object v0, Lcom/google/android/gms/internal/cz$a;->kt:Lcom/google/android/gms/internal/cz$a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    return-void
.end method

.method static synthetic aT()Lcom/google/android/gms/internal/cz$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/cz$a;->ks:Lcom/google/android/gms/internal/cz$a;

    return-object v0
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 0
    .param p1, "canvas"    # Landroid/graphics/Canvas;

    .prologue
    return-void
.end method

.method public getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/cz$a;->kt:Lcom/google/android/gms/internal/cz$a$a;

    return-object v0
.end method

.method public getOpacity()I
    .locals 1

    const/4 v0, -0x2

    return v0
.end method

.method public setAlpha(I)V
    .locals 0
    .param p1, "alpha"    # I

    .prologue
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0
    .param p1, "cf"    # Landroid/graphics/ColorFilter;

    .prologue
    return-void
.end method
