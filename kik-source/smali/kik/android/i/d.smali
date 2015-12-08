.class public final Lkik/android/i/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/graphics/Point;

.field private b:Landroid/graphics/Point;

.field private c:Landroid/graphics/Point;


# direct methods
.method public constructor <init>(Landroid/graphics/Point;Landroid/graphics/Point;Landroid/graphics/Point;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lkik/android/i/d;->a:Landroid/graphics/Point;

    .line 18
    iput-object p2, p0, Lkik/android/i/d;->b:Landroid/graphics/Point;

    .line 19
    iput-object p3, p0, Lkik/android/i/d;->c:Landroid/graphics/Point;

    .line 20
    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/Point;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lkik/android/i/d;->b:Landroid/graphics/Point;

    return-object v0
.end method

.method public final b()Landroid/graphics/Point;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lkik/android/i/d;->c:Landroid/graphics/Point;

    return-object v0
.end method
