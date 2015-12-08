.class public final Lkik/android/util/bk$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/util/bk;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Ljava/lang/String;


# direct methods
.method protected constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput p2, p0, Lkik/android/util/bk$a;->a:I

    .line 41
    iput-object p1, p0, Lkik/android/util/bk$a;->b:Ljava/lang/String;

    .line 42
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 25
    iget v0, p0, Lkik/android/util/bk$a;->a:I

    return v0
.end method

.method public final b()I
    .locals 2

    .prologue
    .line 30
    iget v0, p0, Lkik/android/util/bk$a;->a:I

    iget-object v1, p0, Lkik/android/util/bk$a;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lkik/android/util/bk$a;->b:Ljava/lang/String;

    return-object v0
.end method
