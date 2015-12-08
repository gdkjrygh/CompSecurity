.class final Lorg/spongycastle/jce/provider/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:I

.field b:Ljava/util/Date;


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    const/16 v0, 0xb

    iput v0, p0, Lorg/spongycastle/jce/provider/c;->a:I

    .line 13
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/c;->b:Ljava/util/Date;

    return-void
.end method
