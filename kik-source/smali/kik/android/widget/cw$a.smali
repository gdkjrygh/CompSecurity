.class final Lkik/android/widget/cw$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/widget/cw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;


# direct methods
.method static synthetic a(Lkik/android/widget/cw$a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 380
    iget-object v0, p0, Lkik/android/widget/cw$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lkik/android/widget/cw$a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 380
    iget-object v0, p0, Lkik/android/widget/cw$a;->a:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .prologue
    .line 396
    iget-object v0, p0, Lkik/android/widget/cw$a;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
