.class final Lcom/google/android/gms/maps/b;
.super Lcom/google/android/gms/a/a;


# instance fields
.field private final a:Landroid/view/ViewGroup;

.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/maps/GoogleMapOptions;


# direct methods
.method constructor <init>(Landroid/view/ViewGroup;Landroid/content/Context;Lcom/google/android/gms/maps/GoogleMapOptions;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/a/a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/maps/b;->a:Landroid/view/ViewGroup;

    iput-object p2, p0, Lcom/google/android/gms/maps/b;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/maps/b;->c:Lcom/google/android/gms/maps/GoogleMapOptions;

    return-void
.end method
