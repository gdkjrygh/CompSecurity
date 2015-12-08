.class final Lroboguice/RoboGuice$1;
.super Lcom/google/inject/spi/DefaultElementVisitor;
.source "RoboGuice.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lroboguice/RoboGuice;->setBaseApplicationInjector(Landroid/app/Application;Lcom/google/inject/Stage;[Lcom/google/inject/Module;)Lcom/google/inject/Injector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/inject/spi/DefaultElementVisitor",
        "<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic val$application:Landroid/app/Application;


# direct methods
.method constructor <init>(Landroid/app/Application;)V
    .locals 0

    .prologue
    .line 84
    iput-object p1, p0, Lroboguice/RoboGuice$1;->val$application:Landroid/app/Application;

    invoke-direct {p0}, Lcom/google/inject/spi/DefaultElementVisitor;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic visit(Lcom/google/inject/spi/StaticInjectionRequest;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Lcom/google/inject/spi/StaticInjectionRequest;

    .prologue
    .line 84
    invoke-virtual {p0, p1}, Lroboguice/RoboGuice$1;->visit(Lcom/google/inject/spi/StaticInjectionRequest;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public visit(Lcom/google/inject/spi/StaticInjectionRequest;)Ljava/lang/Void;
    .locals 4
    .param p1, "element"    # Lcom/google/inject/spi/StaticInjectionRequest;

    .prologue
    .line 87
    iget-object v0, p0, Lroboguice/RoboGuice$1;->val$application:Landroid/app/Application;

    invoke-static {v0}, Lroboguice/RoboGuice;->getResourceListener(Landroid/app/Application;)Lroboguice/inject/ResourceListener;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/google/inject/spi/StaticInjectionRequest;->getType()Ljava/lang/Class;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lroboguice/inject/ResourceListener;->requestStaticInjection([Ljava/lang/Class;)V

    .line 88
    const/4 v0, 0x0

    return-object v0
.end method
