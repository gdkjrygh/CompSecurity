.class public final Lcom/kik/j/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/kik/l/ab;

.field private final b:Lkik/android/b/j;


# direct methods
.method public constructor <init>(Lcom/kik/l/ab;Lkik/android/b/j;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/kik/j/g;->a:Lcom/kik/l/ab;

    .line 28
    iput-object p2, p0, Lcom/kik/j/g;->b:Lkik/android/b/j;

    .line 29
    return-void
.end method


# virtual methods
.method final a()Lcom/kik/cache/ad;
    .locals 1
    .annotation runtime Ljavax/inject/Named;
        value = "ContactImageLoader"
    .end annotation

    .prologue
    .line 35
    iget-object v0, p0, Lcom/kik/j/g;->a:Lcom/kik/l/ab;

    invoke-interface {v0}, Lcom/kik/l/ab;->a()Lcom/kik/cache/ad;

    move-result-object v0

    return-object v0
.end method

.method final b()Lcom/kik/cache/ad;
    .locals 1
    .annotation runtime Ljavax/inject/Named;
        value = "ContentImageLoader"
    .end annotation

    .prologue
    .line 42
    iget-object v0, p0, Lcom/kik/j/g;->a:Lcom/kik/l/ab;

    invoke-interface {v0}, Lcom/kik/l/ab;->b()Lcom/kik/cache/ad;

    move-result-object v0

    return-object v0
.end method
