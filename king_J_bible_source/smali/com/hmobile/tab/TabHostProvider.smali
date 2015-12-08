.class public abstract Lcom/hmobile/tab/TabHostProvider;
.super Ljava/lang/Object;
.source "TabHostProvider.java"


# instance fields
.field public context:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 0
    .param p1, "context"    # Landroid/app/Activity;

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/hmobile/tab/TabHostProvider;->context:Landroid/app/Activity;

    .line 15
    return-void
.end method


# virtual methods
.method public abstract getTabHost(Ljava/lang/String;)Lcom/hmobile/tab/TabView;
.end method
