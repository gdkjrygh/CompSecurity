.class public Lroboguice/inject/StringResourceFactory;
.super Ljava/lang/Object;
.source "StringResourceFactory.java"

# interfaces
.implements Lroboguice/inject/ResourceFactory;


# annotations
.annotation runtime Lcom/google/inject/Singleton;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lroboguice/inject/ResourceFactory",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field protected resources:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0
    .param p1, "resources"    # Landroid/content/res/Resources;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lroboguice/inject/StringResourceFactory;->resources:Landroid/content/res/Resources;

    .line 35
    return-void
.end method


# virtual methods
.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # I

    .prologue
    .line 27
    invoke-virtual {p0, p1}, Lroboguice/inject/StringResourceFactory;->get(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public get(I)Ljava/lang/String;
    .locals 1
    .param p1, "id"    # I

    .prologue
    .line 38
    iget-object v0, p0, Lroboguice/inject/StringResourceFactory;->resources:Landroid/content/res/Resources;

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
