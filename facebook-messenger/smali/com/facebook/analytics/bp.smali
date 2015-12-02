.class public Lcom/facebook/analytics/bp;
.super Ljava/lang/Object;
.source "AnalyticsTextWatcher.java"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field private a:Lcom/facebook/analytics/av;


# direct methods
.method public constructor <init>(Lcom/facebook/analytics/av;)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/facebook/analytics/bp;->a:Lcom/facebook/analytics/av;

    .line 14
    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .prologue
    .line 27
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 18
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/facebook/analytics/bp;->a:Lcom/facebook/analytics/av;

    invoke-interface {v0}, Lcom/facebook/analytics/av;->d()V

    .line 23
    return-void
.end method
