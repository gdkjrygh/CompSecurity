.class public Lcom/picksinit/SmartGoGp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/picksinit/goGp;


# instance fields
.field private mUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    const-string v0, ""

    iput-object v0, p0, Lcom/picksinit/SmartGoGp;->mUrl:Ljava/lang/String;

    .line 13
    iput-object p1, p0, Lcom/picksinit/SmartGoGp;->mUrl:Ljava/lang/String;

    .line 14
    return-void
.end method


# virtual methods
.method public goGp(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 17
    new-instance v0, Lcom/cleanmaster/ui/app/utils/MarketContext;

    invoke-direct {v0, p1}, Lcom/cleanmaster/ui/app/utils/MarketContext;-><init>(Landroid/content/Context;)V

    .line 18
    iget-object v1, p0, Lcom/picksinit/SmartGoGp;->mUrl:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/cleanmaster/ui/app/market/d;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 19
    return-void
.end method
