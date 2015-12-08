.class final Lkik/android/util/a$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/util/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lkik/android/util/a;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:[B


# direct methods
.method constructor <init>(Lkik/android/util/a;Ljava/lang/String;Ljava/lang/String;[B)V
    .locals 0

    .prologue
    .line 415
    iput-object p1, p0, Lkik/android/util/a$d;->a:Lkik/android/util/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 416
    iput-object p2, p0, Lkik/android/util/a$d;->b:Ljava/lang/String;

    .line 417
    iput-object p3, p0, Lkik/android/util/a$d;->c:Ljava/lang/String;

    .line 418
    iput-object p4, p0, Lkik/android/util/a$d;->d:[B

    .line 419
    return-void
.end method

.method static synthetic a(Lkik/android/util/a$d;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 408
    iget-object v0, p0, Lkik/android/util/a$d;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lkik/android/util/a$d;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 408
    iget-object v0, p0, Lkik/android/util/a$d;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lkik/android/util/a$d;)[B
    .locals 1

    .prologue
    .line 408
    iget-object v0, p0, Lkik/android/util/a$d;->d:[B

    return-object v0
.end method
