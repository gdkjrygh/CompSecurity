.class public Lcom/facebook/bugreporter/aa;
.super Ljava/lang/Object;
.source "FbAppInfoFetcher.java"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Lcom/facebook/common/l/a;


# direct methods
.method constructor <init>(Ljava/lang/String;ILcom/facebook/common/l/a;)V
    .locals 0

    .prologue
    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    iput-object p1, p0, Lcom/facebook/bugreporter/aa;->a:Ljava/lang/String;

    .line 83
    iput p2, p0, Lcom/facebook/bugreporter/aa;->b:I

    .line 84
    iput-object p3, p0, Lcom/facebook/bugreporter/aa;->c:Lcom/facebook/common/l/a;

    .line 85
    return-void
.end method
