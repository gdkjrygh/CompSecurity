.class final Lcom/google/android/gms/internal/iz$a;
.super Landroid/graphics/drawable/Drawable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/iz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/iz$a$a;
    }
.end annotation


# static fields
.field private static final Mj:Lcom/google/android/gms/internal/iz$a;

.field private static final Mk:Lcom/google/android/gms/internal/iz$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/iz$a;

    invoke-direct {v0}, Lcom/google/android/gms/internal/iz$a;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/iz$a;->Mj:Lcom/google/android/gms/internal/iz$a;

    new-instance v0, Lcom/google/android/gms/internal/iz$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/iz$a$a;-><init>(Lcom/google/android/gms/internal/iz$1;)V

    sput-object v0, Lcom/google/android/gms/internal/iz$a;->Mk:Lcom/google/android/gms/internal/iz$a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    return-void
.end method

.method static synthetic hi()Lcom/google/android/gms/internal/iz$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/iz$a;->Mj:Lcom/google/android/gms/internal/iz$a;

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

    sget-object v0, Lcom/google/android/gms/internal/iz$a;->Mk:Lcom/google/android/gms/internal/iz$a$a;

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
