.class public final Lkik/android/chat/fragment/ad$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/chat/fragment/ad;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "b"
.end annotation


# instance fields
.field a:[Lkik/android/chat/fragment/ad$a;

.field final synthetic b:Lkik/android/chat/fragment/ad;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/ad;)V
    .locals 1

    .prologue
    .line 36
    iput-object p1, p0, Lkik/android/chat/fragment/ad$b;->b:Lkik/android/chat/fragment/ad;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iget v0, p1, Lkik/android/chat/fragment/ad;->b:I

    new-array v0, v0, [Lkik/android/chat/fragment/ad$a;

    iput-object v0, p0, Lkik/android/chat/fragment/ad$b;->a:[Lkik/android/chat/fragment/ad$a;

    .line 38
    return-void
.end method


# virtual methods
.method final a(I)Lkik/android/chat/fragment/ad$a;
    .locals 1

    .prologue
    .line 42
    if-ltz p1, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/ad$b;->a:[Lkik/android/chat/fragment/ad$a;

    array-length v0, v0

    if-lt p1, v0, :cond_1

    .line 43
    :cond_0
    const/4 v0, 0x0

    .line 46
    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lkik/android/chat/fragment/ad$b;->a:[Lkik/android/chat/fragment/ad$a;

    aget-object v0, v0, p1

    goto :goto_0
.end method
