.class public Lroboguice/inject/SystemServiceProvider;
.super Ljava/lang/Object;
.source "SystemServiceProvider.java"

# interfaces
.implements Lcom/google/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/inject/Provider",
        "<TT;>;"
    }
.end annotation


# instance fields
.field protected application:Landroid/app/Application;
    .annotation runtime Lcom/google/inject/Inject;
    .end annotation
.end field

.field protected serviceName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "serviceName"    # Ljava/lang/String;

    .prologue
    .line 29
    .local p0, "this":Lroboguice/inject/SystemServiceProvider;, "Lroboguice/inject/SystemServiceProvider<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lroboguice/inject/SystemServiceProvider;->serviceName:Ljava/lang/String;

    .line 31
    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 35
    .local p0, "this":Lroboguice/inject/SystemServiceProvider;, "Lroboguice/inject/SystemServiceProvider<TT;>;"
    iget-object v0, p0, Lroboguice/inject/SystemServiceProvider;->application:Landroid/app/Application;

    iget-object v1, p0, Lroboguice/inject/SystemServiceProvider;->serviceName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/app/Application;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
