.class public final Lkik/android/util/bw;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/util/bw$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Lkik/android/util/bw$a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lkik/android/util/bw$a;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    .line 22
    iput-object p1, p0, Lkik/android/util/bw;->a:Ljava/lang/String;

    .line 23
    iput-object p2, p0, Lkik/android/util/bw;->b:Lkik/android/util/bw$a;

    .line 24
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 29
    iget-object v0, p0, Lkik/android/util/bw;->b:Lkik/android/util/bw$a;

    if-eqz v0, :cond_0

    .line 30
    iget-object v0, p0, Lkik/android/util/bw;->b:Lkik/android/util/bw$a;

    iget-object v1, p0, Lkik/android/util/bw;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Lkik/android/util/bw$a;->a(Ljava/lang/String;)V

    .line 32
    :cond_0
    return-void
.end method
