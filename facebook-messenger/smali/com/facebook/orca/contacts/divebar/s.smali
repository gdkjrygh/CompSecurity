.class Lcom/facebook/orca/contacts/divebar/s;
.super Ljava/lang/Object;
.source "DivebarFragment.java"

# interfaces
.implements Lcom/facebook/contacts/picker/ap;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/divebar/DivebarFragment;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/divebar/DivebarFragment;)V
    .locals 0

    .prologue
    .line 290
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/s;->a:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3

    .prologue
    .line 293
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/s;->a:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    invoke-static {v0, p1}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a(Lcom/facebook/orca/contacts/divebar/DivebarFragment;I)I

    .line 294
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/s;->a:Lcom/facebook/orca/contacts/divebar/DivebarFragment;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/contacts/divebar/DivebarFragment;->a(Lcom/facebook/orca/contacts/divebar/DivebarFragment;J)J

    .line 295
    return-void
.end method
