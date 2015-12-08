.class final Lkik/a/g/v$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/a/g/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lkik/a/g/v;


# direct methods
.method private constructor <init>(Lkik/a/g/v;)V
    .locals 0

    .prologue
    .line 471
    iput-object p1, p0, Lkik/a/g/v$b;->a:Lkik/a/g/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lkik/a/g/v;B)V
    .locals 0

    .prologue
    .line 471
    invoke-direct {p0, p1}, Lkik/a/g/v$b;-><init>(Lkik/a/g/v;)V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 471
    check-cast p1, Lkik/a/d/k;

    check-cast p2, Lkik/a/d/k;

    invoke-virtual {p1}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/a/h/i;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method
