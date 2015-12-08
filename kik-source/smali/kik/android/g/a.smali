.class public final Lkik/android/g/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Z

.field private b:Lkik/a/d/k;

.field private c:I


# direct methods
.method public constructor <init>(Lkik/a/d/k;IZ)V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lkik/android/g/a;->b:Lkik/a/d/k;

    .line 13
    iput p2, p0, Lkik/android/g/a;->c:I

    .line 14
    iput-boolean p3, p0, Lkik/android/g/a;->a:Z

    .line 15
    return-void
.end method


# virtual methods
.method public final a()Lkik/a/d/k;
    .locals 1

    .prologue
    .line 24
    iget-object v0, p0, Lkik/android/g/a;->b:Lkik/a/d/k;

    return-object v0
.end method
