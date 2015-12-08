.class public final Lcom/cmcm/adsdk/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZLjava/lang/String;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-boolean p1, p0, Lcom/cmcm/adsdk/k;->a:Z

    .line 16
    iput-object p2, p0, Lcom/cmcm/adsdk/k;->b:Ljava/lang/String;

    .line 17
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .prologue
    .line 20
    iget-boolean v0, p0, Lcom/cmcm/adsdk/k;->a:Z

    return v0
.end method
