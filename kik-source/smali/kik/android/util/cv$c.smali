.class public final Lkik/android/util/cv$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/util/cv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Landroid/graphics/Bitmap;

.field private d:Lcom/kik/f/a/a/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/kik/f/a/a/a;)V
    .locals 0

    .prologue
    .line 343
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 344
    iput-object p1, p0, Lkik/android/util/cv$c;->a:Ljava/lang/String;

    .line 345
    iput-object p2, p0, Lkik/android/util/cv$c;->b:Ljava/lang/String;

    .line 346
    iput-object p3, p0, Lkik/android/util/cv$c;->c:Landroid/graphics/Bitmap;

    .line 347
    iput-object p4, p0, Lkik/android/util/cv$c;->d:Lcom/kik/f/a/a/a;

    .line 348
    return-void
.end method


# virtual methods
.method public final a()Lcom/kik/f/a/a/a;
    .locals 1

    .prologue
    .line 352
    iget-object v0, p0, Lkik/android/util/cv$c;->d:Lcom/kik/f/a/a/a;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 357
    iget-object v0, p0, Lkik/android/util/cv$c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 367
    iget-object v0, p0, Lkik/android/util/cv$c;->c:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 377
    iget-object v0, p0, Lkik/android/util/cv$c;->b:Ljava/lang/String;

    return-object v0
.end method
