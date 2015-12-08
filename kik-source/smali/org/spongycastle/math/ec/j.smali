.class final Lorg/spongycastle/math/ec/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/math/ec/d;


# instance fields
.field private a:[Lorg/spongycastle/math/ec/ECPoint$F2m;


# direct methods
.method constructor <init>([Lorg/spongycastle/math/ec/ECPoint$F2m;)V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/math/ec/j;->a:[Lorg/spongycastle/math/ec/ECPoint$F2m;

    .line 26
    iput-object p1, p0, Lorg/spongycastle/math/ec/j;->a:[Lorg/spongycastle/math/ec/ECPoint$F2m;

    .line 27
    return-void
.end method


# virtual methods
.method protected final a()[Lorg/spongycastle/math/ec/ECPoint$F2m;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lorg/spongycastle/math/ec/j;->a:[Lorg/spongycastle/math/ec/ECPoint$F2m;

    return-object v0
.end method
