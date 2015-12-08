.class final Lkik/android/widget/aa$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/widget/aa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lkik/android/widget/aa;


# direct methods
.method constructor <init>(Lkik/android/widget/aa;)V
    .locals 0

    .prologue
    .line 373
    iput-object p1, p0, Lkik/android/widget/aa$a;->a:Lkik/android/widget/aa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 373
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    invoke-static {}, Lkik/android/widget/aa;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/widget/aa$b;

    iget v1, v0, Lkik/android/widget/aa$b;->c:I

    invoke-static {}, Lkik/android/widget/aa;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/widget/aa$b;

    iget v0, v0, Lkik/android/widget/aa$b;->c:I

    sub-int/2addr v0, v1

    return v0
.end method
